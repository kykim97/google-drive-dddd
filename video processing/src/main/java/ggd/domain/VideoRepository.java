package ggd.domain;

import ggd.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(collectionResourceRel="videos", path="videos")
public interface VideoRepository extends PagingAndSortingRepository<Video, >{
}