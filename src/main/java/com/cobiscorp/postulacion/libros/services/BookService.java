package com.cobiscorp.postulacion.libros.services;

import com.cobiscorp.postulacion.libros.models.BookModel;
import com.cobiscorp.postulacion.libros.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class BookService {
    @Autowired
    BookRepository bookRepository;

    public ArrayList<BookModel>
}
