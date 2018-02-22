import React, {Component} from 'react';
import {
    Platform,
    StyleSheet,
    Text,
    View,
    TextInput,
    Image
} from 'react-native';
import {TabNavigator} from 'react-navigation';

export default class Home extends Component {
    render() {
        return(
            <View style={styles.container}> 
                <Text style={styles.header}>Home</Text>
                <View style={styles.logoContainer}>
                    <Image
                        style={styles.logo}
                        source={require('../src/logoContainer.png')}
                    />
                    <Text style={styles.content}>welcome to </Text>
                    <Text style={styles.content}>OWS</Text>
                </View>
            </View>
        );
    }
}

const styles = StyleSheet.create({
    container: {
        flex: 1,
    },
    header: {
        backgroundColor: 'blue',
        textAlign: 'center',
        fontSize: 30,
        color: '#e74c3c',
        backgroundColor: '#2ecc71',
        paddingTop: 20,
        paddingBottom: 10,
    },
    logoContainer: {
        flex: 1,
        paddingTop: 20,
        alignItems: 'center'
    },
    logo: {
        width: 400,
        height: 200
    },
    content: {
        textAlign: 'center',
        fontSize: 50,
        color: 'rgba(34,139,34,0.6)'
    }
});