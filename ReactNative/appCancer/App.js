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
import Category from './components/Category';

var navigationOptionHome ={
  title: '<Home/>',
  headerStyle: { //không dùng header vì dành cho IOS
    backgroundColor: 'rgba(34,139,34,0.5)',
  },
  headerTitleStyle: { 
    color: 'white',
    textAlign: 'center',
    fontSize: 30,
  },
}
var navigationOptionCategory ={
  title: '<Category/>',
  headerStyle: { //không dùng header vì dành cho IOS
    backgroundColor: 'rgba(34,139,34,0.5)',
  },
  headerTitleStyle: { 
    color: 'white',
    textAlign: 'center',
    fontSize: 30,
  },
}
const appCancer = StackNavigator(
  
  {
    Home: {
      screen: Home,
        navigationOptions: navigationOptionHome,
    },
    Category: {
      screen: Category,
      navigationOptions: navigationOptionCategory,
    }
  }, 
  
)
export default appCancer;




