package net.camacho.api.service.jpa;

import net.camacho.api.entity.Album;
import net.camacho.api.repository.AlbumsRepository;
import net.camacho.api.service.IAlbumsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AlbumsService implements IAlbumsService {

    @Autowired
    private AlbumsRepository albumsRepository;

    @Override
    public List<Album> buscarTodos() {
        return albumsRepository.findAll();
    }

    @Override
    public void guardar(Album album) {
        albumsRepository.save(album);
    }

    @Override
    public void eliminar(int idAlbum) {
        albumsRepository.deleteById(idAlbum);
    }
}
