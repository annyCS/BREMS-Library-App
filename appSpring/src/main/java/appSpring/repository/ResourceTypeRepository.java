package appSpring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import appSpring.model.ResourceType;

public interface ResourceTypeRepository extends JpaRepository<ResourceType, Integer>{

	ResourceType findByName(String name);

	ResourceType findByNameLikeIgnoreCase(String type);
}
