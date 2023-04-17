package com.example.user_service.dto;

import com.example.user_service.entity.contect;
import com.example.user_service.entity.user;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class allUser {
    private user user;
    private contect contect;
}
