package com.many_to_many.service;

import com.many_to_many.model.AddressModel;
import com.many_to_many.model.StudentModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AddressService {

    // getAll
    List<AddressModel> getAll();

    // create
    AddressModel create(AddressModel addressModel);

    // getById
    AddressModel getById(Long id);
}
