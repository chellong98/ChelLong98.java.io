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
  Image,
} from 'react-native';
import htmlView from 'react-native-htmlview';
import HtmlView from 'react-native-htmlview';


export default class App extends Component {
  render() {
    const htmlHeader = '<h1>Bài Viết</h1>';
    const htmlSource = '<h6>Liam - Theo Tri Thức Trẻ | 20:<p>00 26/02/2018</p></h6>';
    const htmlContent = '<h5>Khi một hãng smartphone Hàn Quốc đang trở thành tâm điểm của cả thế giới smartphone, bạn khó lòng có thể bỏ qua hãng smart phone Hàn Quốc còn lại. Đáng buồn thay, tên tuổi smartphone đứng thứ 2 của Hàn Quốc lại đang ngập chìm trong thất vọng.</h5>';
    return (
      <View style={styles.container}>

        <View style={styles.header}>
          <HtmlView
            value={htmlHeader}
            stylesheet={styles}           
          />
        </View>

        <View style={styles.body}>
          <HtmlView
            value={htmlSource}
            stylesheet={styles}
          />
          <Text style={styles.txtTitle}>Giữa MWC và cơn bão Galaxy S9, Ngậm ngùi nhờ đến LG</Text>
          <Image
            style={styles.image}
            source={{uri: 'http://ows.vn/images/branding.png'}}
          />
          <HtmlView
            value={htmlContent}
            stylesheet={styles}
          />
          <Text style={{color: 'grey', fontSize: 15,fontFamily: 'georgia',}}>Security Warning: Currently, onMessage and postMessage do not allow specifying an origin. This can lead to cross-site scripting attacks if an unexpected document is loaded within a WebView instance. Please refer to the MDN documentation for Window.postMessage() for more details on the security implications of this.</Text>
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
    backgroundColor: 'red',
    borderRadius: 2,
    borderColor: '#ddd',
    borderBottomWidth: 1,
    shadowColor: '#000',
    shadowOffset: { width: 20, height: 2 },
    shadowOpacity: 0.8,
    shadowRadius: 2,
    elevation: 1,
    flex: 1/10,
    justifyContent: 'center',
    alignItems: 'center',

  },
  h1: {
    fontSize: 30,
    color: 'white',
  },
  h6: {
    color: 'grey',
  },
  h5: {
    fontFamily: 'georgia',
    fontSize: 15,
    fontWeight: '300',
    color: 'black',
    paddingTop: 10,
  },
  p: {
    color: 'black',
  },
  body: {
    flex: 9/10,
    paddingLeft: 10,
  },
  txtTitle: {
    fontSize: 25,
    fontWeight: '300',
    color: 'black',
  },
  image: {
    flex: 7/10,
    
  }
});
