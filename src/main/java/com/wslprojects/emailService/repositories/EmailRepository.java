package com.wslprojects.emailService.repositories;

import com.wslprojects.emailService.models.EmailModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmailRepository extends JpaRepository<EmailModel, Long> {
}
