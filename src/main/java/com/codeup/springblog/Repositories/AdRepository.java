package com.codeup.springblog.Repositories;

import com.codeup.springblog.Models.Ad;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdRepository extends JpaRepository <Ad, Long>{

    Ad findByTitle(String title);


}
