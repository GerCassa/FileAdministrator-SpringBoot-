package com.codeclan.homework.FileAdminHomework.repositories;

import com.codeclan.homework.FileAdminHomework.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FolderRepository extends JpaRepository<Folder, Long> {
}
