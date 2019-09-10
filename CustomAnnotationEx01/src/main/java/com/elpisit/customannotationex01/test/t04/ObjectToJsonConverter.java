package com.elpisit.customannotationex01.test.t04;

public class ObjectToJsonConverter {
    public void givenObjectSerializedThenTrueReturned() throws JsonSerializationException {
//        Person person = new Person("soufiane", "cheouati", "34");

//        JsonSerializer serializer = new JsonSerializer();
//        String jsonString = serializer.serialize(person);
//        assertEquals(
//                "{\"personAge\":\"34\",\"firstName\":\"Soufiane\",\"lastName\":\"Cheouati\"}",
//                jsonString);
    }

    public static void main(String[] args) {
        Person person = new Person("soufiane", "cheouati", "34", "Sri Lanka");
        CheckObject checkObject=new CheckObject();
        try {
            System.out.println(person.toString());
            System.out.println("@JsonSerializable :"+person.getClass().isAnnotationPresent(JsonSerializable.class));
            checkObject.checkIfSerializable(person);
            checkObject.initializeObject(person);
            System.out.println(person.toString());

        } catch (JsonSerializationException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            System.out.println(checkObject.convertToJson(person));
        } catch (JsonSerializationException e) {
            e.printStackTrace();
        }

    }
}
