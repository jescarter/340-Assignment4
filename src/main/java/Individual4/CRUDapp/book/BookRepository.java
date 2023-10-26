package Individual4.CRUDapp.book;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    public List<Book> findByTitle(String title);

     @Query("SELECT b FROM Book b WHERE CONCAT(b.title, b.author, b.isbn) LIKE %?1%")
     public List<Book> search(String term);
}
