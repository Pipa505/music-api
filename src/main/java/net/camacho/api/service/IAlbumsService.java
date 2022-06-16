package net.camacho.api.service;

import net.camacho.api.entity.Album;

import java.util.List;

public interface IAlbumsService {
    List<Album> buscarTodos();
    void guardar(Album album);

    void eliminar(int idAlbum);
}
