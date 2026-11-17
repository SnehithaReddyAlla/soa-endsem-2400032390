package com.klef.soa.docker.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Builder;

@Entity
@Table(name = "video_editing_jobs")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class VideoEditingJobEntity 
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String clientName;
    
    @Column(nullable = false)
    private String videoType;
    
    @Column(nullable = false)
    private double fee;
    
    @Column(nullable = false)
    private boolean completed;
}
