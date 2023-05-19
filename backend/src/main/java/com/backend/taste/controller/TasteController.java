package com.backend.taste.controller;

import com.backend.taste.dto.TasteDTO;
import com.backend.taste.dto.TasteResultDTO;
import com.backend.taste.service.TasteServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TasteController {
    private final TasteServiceImpl tasteServiceImpl;

    @PostMapping("/tasteTest")
    public TasteResultDTO tasteTest(@RequestBody TasteDTO tasteDTO) {
        return tasteServiceImpl.tasteResProgress(tasteDTO);
    }

    @GetMapping("/getTaste")
    public TasteResultDTO getTestResult() {
        return tasteServiceImpl.getTestResult();
    }

}
