package ua.edu.ucu.apps.flowerstore.flower;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlowerService {
    private FlowerRepository flowerRepository;
    @Autowired
    public FlowerService(FlowerRepository flowerRepository){
        this.flowerRepository = flowerRepository;
    }
    public List<Flower> getFlowers(){
        return flowerRepository.findAll();
    }
    public void addFlower(Flower flower){
        flowerRepository.save(flower);
    }
}
