package com.tufi.secretmanager.service;

import com.tufi.secretmanager.dto.SecretRequest;
import com.tufi.secretmanager.dto.SecretResponse;
import com.tufi.secretmanager.dto.SecretUpdateRequest;

import java.util.List;

public interface SecretService {
    List<SecretResponse> getAllSecrets();
    SecretResponse getSecretByName(String name);
    SecretResponse createSecret(SecretRequest secretRequest);
    SecretResponse updateSecret(String name, SecretUpdateRequest updateRequest);
    void deleteSecret(String name);
}
