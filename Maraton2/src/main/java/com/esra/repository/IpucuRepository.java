package com.esra.repository;

import com.esra.entity.Ipucu;

public class IpucuRepository extends RepositoryManager<Ipucu,Long> {
    public IpucuRepository() {
        super(new Ipucu());
    }
}
