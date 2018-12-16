package pl.komorowski.courseapidata.topic;

import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic, String> {





    //getAllTopics()
    //getTopic(String id)
    //update topic(Topic t)
    //deleteTopic(String id)
}

