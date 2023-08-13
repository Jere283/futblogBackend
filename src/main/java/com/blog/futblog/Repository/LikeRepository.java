package com.blog.futblog.Repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.blog.futblog.Models.Like;

public interface LikeRepository extends  CrudRepository<Like, Integer>{
    @Query("SELECT COUNT(l) FROM Like l WHERE l.likepublicacion.id = :publicacionId")
    Integer countLikesByPublicacionId(Integer publicacionId);
}