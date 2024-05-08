package com.many_to_many.serviceImpl;

import com.many_to_many.model.AddressModel;
import com.many_to_many.repository.AddressRepository;
import com.many_to_many.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    private AddressRepository addressRepository;

    @Override
    public List<AddressModel> getAll() {
        return addressRepository.findAll();
    }

    @Override
    public AddressModel create(AddressModel addressModel) {
        return addressRepository.save(addressModel);
    }

    @Override
    public AddressModel getById(Long id) {
        return addressRepository.findById(id).orElse(null);
    }
}
