package com.example.codeclan.files_and_folders.controllers;

import com.example.codeclan.files_and_folders.models.Folder;
import com.example.codeclan.files_and_folders.repositories.FolderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FolderController {

    @Autowired
    FolderRepository folderRepository;

    @GetMapping(name="/folders")
    public ResponseEntity<List<Folder>> getAllFolders(){
        List<Folder> allFolders = folderRepository.findAll();
        return new ResponseEntity<>(allFolders, HttpStatus.OK);
    }
}
