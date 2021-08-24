public class BmiService {
    public float calcilate (float weight, float height){
        float BodyMassIndex = weight / (height * height);
        return BodyMassIndex;
    }
}
