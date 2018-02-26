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
  TouchableOpacity
} from 'react-native';




export default class App extends Component {
  render() {
    return (
      <View style={styles.bao}>
        <View style={styles.dong}>
          <TouchableOpacity style={styles.cot}></TouchableOpacity>
          <TouchableOpacity style={styles.cot}>
            <Text>2</Text>
            <Text>ABC</Text>
          </TouchableOpacity>
          <TouchableOpacity style={styles.cot}></TouchableOpacity>
        </View>
        <View style={styles.dong}>
          <TouchableOpacity style={styles.cot}></TouchableOpacity>
          <TouchableOpacity style={styles.cot}></TouchableOpacity>
          <TouchableOpacity style={styles.cot}></TouchableOpacity>
        </View>
        <View style={styles.dong}>
          <TouchableOpacity style={styles.cot}></TouchableOpacity>
          <TouchableOpacity style={styles.cot}></TouchableOpacity>
          <TouchableOpacity style={styles.cot}></TouchableOpacity>
        </View>
        <View style={styles.dong}>
          <TouchableOpacity style={styles.cot}></TouchableOpacity>
          <TouchableOpacity style={styles.cot}></TouchableOpacity>
          <TouchableOpacity style={styles.cot}></TouchableOpacity>
        </View>
      </View>
    );
  }
}

const styles = StyleSheet.create({
  bao: {
    // backgroundColor: 'black',
    flex: 1,
  },
  dong: {
    // backgroundColor: 'green',
    flex: 1,
    // borderBottomWidth: 1,
    // borderBottomColor: 'grey',
    flexDirection: 'row',
  },
  cot: {
    flex: 1,
    // backgroundColor: 'blue',
    borderColor: 'grey',
    borderWidth: 1,
    justifyContent: 'center',
    alignItems: 'center',
  }
});
