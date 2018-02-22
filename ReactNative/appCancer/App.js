/**
 * Sample React Native App
 * https://github.com/facebook/react-native
 * @flow
 */

import React, { Component } from 'react';
import {
  AppRegistry,
  Platform,
  StyleSheet,
  Text,
  View,
  Navigator
} from 'react-native';
import {StackNavigator} from 'react-navigation';
import Home from './components/Home';
const appCancer = StackNavigator(
  {
    Home: {
      screen: Home,
    }
  }
)
export default appCancer;




