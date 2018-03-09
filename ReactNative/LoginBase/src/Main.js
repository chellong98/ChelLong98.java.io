import React from 'react';
import {StackNavigator} from 'react-navigation';
import {Root} from 'native-base';
import Home from './screens/Home';
import Login from './screens/Login';

const Main = StackNavigator(
    {
        Home: {
            screen: Home
        },
        Login: {
            screen: Login
        }
    },
    {
        initialRouteName: "Home",
        headerMode: "none",
    }
)

export default Main;
