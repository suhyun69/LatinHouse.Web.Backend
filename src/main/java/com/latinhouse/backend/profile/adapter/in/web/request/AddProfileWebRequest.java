package com.latinhouse.backend.profile.adapter.in.web.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class AddProfileWebRequest {
    private String id;
    private String content;
}
