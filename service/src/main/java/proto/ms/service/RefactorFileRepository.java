package proto.ms.service;

import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by civerson on 12/21/14.
 */
public interface RefactorFileRepository extends PagingAndSortingRepository<RemoteFile, String> {
}
