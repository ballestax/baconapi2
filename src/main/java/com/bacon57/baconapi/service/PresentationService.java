package com.bacon57.baconapi.service;

import com.bacon57.baconapi.dto.PresentationDto;
import com.bacon57.baconapi.model.Presentation;

import java.util.List;

public interface PresentationService {

    Presentation savePresentation(Presentation presentation);

    List<PresentationDto> getAllPresentations();

    List<Presentation> getAllPresentationsByProductId(Long productId);

    PresentationDto getPresentationById(long id);

    Presentation updatePresentation(Presentation presentation, long id);

    void delete(long id);

}
