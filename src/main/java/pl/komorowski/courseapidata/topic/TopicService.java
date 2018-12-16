package pl.komorowski.courseapidata.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;

    private List<Topic> topics = new ArrayList<>( Arrays.asList
                (new Topic("spring", "Spring Framework", "Spring framework description"),
                new Topic("java", "Core Java", "Core Java description"),
                new Topic("javascrpit", "JavaScript", "JavaScript description")));

    public List<Topic> getAllTopics(){
        List<Topic> topics = new ArrayList<>();
        topicRepository.findAll().forEach(topics::add);
        return topics;
    }

    public Topic getTopic(String id){
//       return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
        return topicRepository.findById(id).orElse(null);

    }

    public void addTopic(Topic topic) {
        topicRepository.save(topic);
    }

    public void updateTopic(Topic topic, String id) {
        topicRepository.save(topic);
    }

    public void deleteTopic(String id) {

        topicRepository.deleteById(id);

    }
}