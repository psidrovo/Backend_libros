package com.cobiscorp.postulacion.libros.repositories;

import com.cobiscorp.postulacion.libros.models.BookModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends CrudRepository<BookModel, String> {
}
