import React, { useState } from "react";
import axios from "axios";
import { View, Text, StyleSheet, Button ,TextInput } from 'react-native';

const Weather = () => {
    const [weather, setWeather] = useState(null);
    const [city, setCity] = useState(null);
    
    //https://api.openweathermap.org/data/2.5/weather?q={city name}&appid={API key}

    const API_KEY = "bd932a01469f902d3835118dbb3f697e";

    const getWeather = async () => {
        try {
            const response = await axios.get(
                `https://api.openweathermap.org/data/2.5/weather?q=${city}&appid=${API_KEY}`
            );
            setWeather(response.data);
        } catch (error) {
            console.error("Error Fetching Weather Data", error);
        }
    }
    return (
        <View style={styles.container}>
            <Text style={styles.title}>Weather ☂️ {city}</Text>
            <TextInput
                placeholder="City Name i.e. London or Bangkok"
                value={city}
                onChangeText={(newText) => setCity(newText)}
                style={styles.input}
            />
            <Button title="Get Weather" onPress={getWeather} color= "#495371" />
            {weather && (
                <View style={styles.infoContainer}>
                    <Text style={styles.infoTemp}>
                        {Math.round (weather.main.temp - 273.15) } °C
                    </Text>
                    <Text>Feel like : {weather.main.feels_like}</Text>
                    <Text>{weather.weather[0].description}</Text>
                    <Text style={styles.weatherText}>Pressure: {weather.main.pressure}</Text>
                    <Text style={styles.weatherText}>Wind speed: {weather.wind.speed}</Text>
                    <Text style={styles.weatherText}>Wind deg: {weather.wind.deg}</Text>
                </View>
            )}
        </View>
    )
};

const styles = StyleSheet.create({
    container: {
        flex: 1,
        //backgroundColor: "",
        alignItems: "center",
        justifyContent: "center",
    },
    title: {
        fontSize: 24,
        margin: 10,
        fontWeight:"bold",
    },
    infoContainer: {
        backgroundColor: "#BEADFA",
        marginTop: 15,
        paddingVertical: 10,
        paddingHorizontal: 15,
        borderRadius: 10,
        borderWidth: 1,
        borderColor: "#0d4c73",
    },
    info: {
        fontSize: 18,
    },
    input:{
        margin:5,
        paddingVertical:5,
        padding:5,
        borderColor:"#000",
        backgroundColor:"#F1E0AC",
        borderRadius:6,
        borderWidth:1,
        textAlign:"center"
    },
    infoTemp: {
        fontSize: 18,
        fontWeight:"bold"
    },

})
export default Weather;