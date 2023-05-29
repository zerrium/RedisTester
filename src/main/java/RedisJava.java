import redis.clients.jedis.Jedis;

import java.util.List;

public class RedisJava {
    public static void main(String[] args) {
        //Connecting to Redis server on localhost
        Jedis jedis = new Jedis("");
        System.out.println("Connection to server sucessfully");
        //check whether server is running or not
        System.out.println("Server is running: "+jedis.ping());

        //String example
//        jedis.set("test-string", "Halo halo");
        // Get the stored data and print it
        System.out.println("Stored string in redis:: "+ jedis.get("test-string"));

        //List example
//        jedis.lpush("test-list", "Redis");
//        jedis.lpush("test-list", "Mongodb");
//        jedis.lpush("test-list", "Mysql");
        // Get the stored data and print it
        List<String> list = jedis.lrange("test-list", 0 ,3);

        for (String s : list) {
            System.out.println("Stored string in redis:: " + s);
        }
    }
} 