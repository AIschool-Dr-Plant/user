package com.dr_plant.project.mapper;

import org.springframework.stereotype.Service;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;
import java.util.Optional;

@Service
public class ImageService {

    public Optional<String> extractImageUrl(String url) {
        try {
            Document doc = Jsoup.connect(url).get();
            Element imgElement = doc.selectFirst("img"); // id="img_pop_view"인 요소 선택
            if (imgElement != null) {
                return Optional.of(imgElement.attr("src"));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return Optional.empty();
    }
}