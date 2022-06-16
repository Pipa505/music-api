package net.camacho.api.repository;

import net.camacho.api.entity.Album;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlbumsRepository extends JpaRepository<Album,Integer> {
}
