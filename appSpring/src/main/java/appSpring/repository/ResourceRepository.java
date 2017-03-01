package appSpring.repository;

import java.util.List;

import appSpring.entity.Genre;
import appSpring.entity.Resource;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ResourceRepository extends JpaRepository<Resource, Integer> {

	List<Resource> findByTitle(String title);

	List<Resource> findByAuthor(String author);

	List<Resource> findByEditorial(String editorial);

	List<Resource> findByGenre(Genre genre);

	/*Page<Resource> findByResourceType(ResourceType productType, Pageable page);*/

}
