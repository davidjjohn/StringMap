public interface StringMap {
    // binds key to value
    public void put(String key, String value);

    // get value bound to key of null
    public String get(String key);
}
