/**
 * Sample React Native App
 * https://github.com/facebook/react-native
 * @flow 
 */

import React, { Component } from 'react';
import {
  Platform,
  StyleSheet,
  Text,
  View,
  ImageBackground,
  Image
} from 'react-native';
import SplashScreen from 'react-native-splash-screen';
import {Container, Header, Body,} from 'native-base';

export interface Props {};
export default class splashscreen extends Component<Props> {
    
  render() {
    return (
        <Container>
          <Body>
            <Image source={require('./../../images/LoadingScreen.png')}/>
          </Body>
        </Container>
    
    );
  }
  
}

const styles = StyleSheet.create({
 
});
