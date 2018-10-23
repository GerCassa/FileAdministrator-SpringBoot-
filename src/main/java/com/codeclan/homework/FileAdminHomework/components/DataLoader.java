package com.codeclan.homework.FileAdminHomework.components;

import com.codeclan.homework.FileAdminHomework.models.File;
import com.codeclan.homework.FileAdminHomework.models.Folder;
import com.codeclan.homework.FileAdminHomework.models.User;
import com.codeclan.homework.FileAdminHomework.repositories.FileRepository;
import com.codeclan.homework.FileAdminHomework.repositories.FolderRepository;
import com.codeclan.homework.FileAdminHomework.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    UserRepository userRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    FileRepository fileRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        User micmac = new User("MicMac");
        userRepository.save(micmac);

        Folder photos = new Folder("photos", micmac);
        folderRepository.save(photos);

        Folder music = new Folder("music", micmac);
        folderRepository.save(music);

        File photo1 = new File("photo1", ".jpg", 5, photos);
        File photo2 = new File("photo2", ".png", 10, photos);
        File song1 = new File("song1", ".mp3", 100, music);
        File song2 = new File("song2", ".wav", 20, music);
        fileRepository.save(photo1);
        fileRepository.save(photo2);
        fileRepository.save(song1);
        fileRepository.save(song2);
    }
}
