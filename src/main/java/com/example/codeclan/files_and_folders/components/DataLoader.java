package com.example.codeclan.files_and_folders.components;

import com.example.codeclan.files_and_folders.models.File;
import com.example.codeclan.files_and_folders.models.Folder;
import com.example.codeclan.files_and_folders.models.User;
import com.example.codeclan.files_and_folders.repositories.FileRepository;
import com.example.codeclan.files_and_folders.repositories.FolderRepository;
import com.example.codeclan.files_and_folders.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    UserRepository userRepository;

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args) {
        User user1 = new User("John");
        userRepository.save(user1);

        User user2 =  new User("Beavis");
        userRepository.save(user2);

        Folder folder1 = new Folder("to do list", user1);
        folderRepository.save(folder1);

        Folder folder2 = new Folder("finance", user2);
        folderRepository.save(folder2);

        File file1 = new File("Shopping", ".xml", 50, folder1);
        fileRepository.save(file1);

        File file2 = new File("budget", ".csv", 60, folder2);


    }
}
