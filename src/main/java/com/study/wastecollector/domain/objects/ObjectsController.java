package com.study.wastecollector.domain.objects;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/objects")
public class ObjectsController {
    private final ObjectsService objectsService;

    @PostMapping()
    public void createObject(
            @RequestBody ObjectsRequestDto objectsRequestDto
    ) {
        objectsService.createObject(objectsRequestDto);
    }
}
