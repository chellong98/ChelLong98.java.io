import React, {
    Component
} from 'react';
import {
    Platform,
    StyleSheet,
    Text,
    View,
    TextInput,
} from 'react-native';
import {
    TabNavigator
} from 'react-navigation';
import Home from './android/app/src/Home';
import Contact from './android/app/src/Contact';

export const Navigation = TabNavigator({
        Home: {
            screen: Home,
        },
        Contact: {
            screen: Contact,
        },
    }, {
        // tabBarComponent: TXTabBar,
        tabBarPosition: 'bottom',
        tabBarOptions: {
            activeTintColor: '#e91e63',
            labelStyle: {
                fontSize: 15,
            },
            style: {
                backgroundColor: '#2ecc71',
            },
            lazy: 'true',
        }
    },

)
export default Navigation;
