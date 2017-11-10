package school.domain;

import java.util.Set;

import org.springframework.data.neo4j.annotation.QueryResult;

@QueryResult
public class SubjectResult {
	
	Subject	subject;
	Set<TaughtBy> taughtBies;
	Teacher teacher;
	
	public Subject getSubject() {
		return subject;
	}
	public Set<TaughtBy> getTaughtBies() {
		return taughtBies;
	}
	public Teacher getTeacher() {
		return teacher;
	}

}
