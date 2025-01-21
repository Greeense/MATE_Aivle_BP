package com.example.MATE.service;

import com.example.MATE.dto.RequestDto;
import com.example.MATE.model.AdminFeedback;
import com.example.MATE.repository.AdminRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AdminService {

    private final AdminRepository adminRepository;

    public List<RequestDto> getAllRequests() {
        // 모든 요청 가져오기 로직
        return new ArrayList<>();
    }

    public List<AdminFeedback> getFeedbackList() {
        // 모든 피드백 가져오기
        return adminRepository.findFeedbacks();
    }

    public AdminFeedback getFeedbackById(Integer feedbackId) {
        return adminRepository.findById(Long.valueOf(feedbackId))
                .orElseThrow(() -> new IllegalArgumentException("해당 피드백을 찾을 수 없습니다: " + feedbackId));
    }
}