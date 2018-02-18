import React, {Component} from 'react';
import {
    Platform,
    StyleSheet,
    Text,
    View,
    TextInput,
    ListView,
} from 'react-native';

var DATA = [
    {name: "mr. Hoàng", numberPhone: 111111111111111},
    {name: "mr. Long", numberPhone: 222222222222222},
    {name: "mr. Hiếu", numberPhone: 3333333333333},
    {name: "mr. Hùng", numberPhone: 44444444444444},
    {name: "mr. Thắng", numberPhone:555555555555},
    {name: "mr. Nam", numberPhone:666666666666},
    {name: "mrs. Thánh", numberPhone:77777777777777},
];

export default class Contact extends Component {
    constructor(props) {
        super(props);
        var ds = new ListView.DataSource({rowHasChanged:(r1,r2)=>r1!=r2});
        this.state={
            dataSource:ds.cloneWithRows(DATA)//sao chép dữ liệu từng dòng và dataSource
        };
    }

    taoHang(property) { //truyên vào thuộc tính là dữ liệu từng hàng
        return (
            <View>
                <Text style={styles.listContent}>{property.name} - {property.numberPhone}</Text>
            </View>
        );
    }

    render() {
        return(
            <View style={styles.container}> 
                <Text style={styles.contact}>CONTACT</Text>
                <TextInput
                    style={styles.search}
                    placeholder="Search"
                    placeholderTextColor="rgba(255,255,255,0.6)"
                 />
                <ListView
                    style={styles.list}
                    dataSource={this.state.dataSource}
                    renderRow={this.taoHang} 
                />
            </View>
        );
    }
}

const styles = StyleSheet.create({
    container: {
        flex: 1
    },
   contact: {
       textAlign: 'center',
       fontSize: 30,
       color: '#e74c3c',
       backgroundColor: '#2ecc71',
       paddingTop: 20,
       paddingBottom: 10,
   },
   list: {
       paddingTop: 20,
       backgroundColor: '#9b59b6',
       borderWidth: 1.5,
   },
   listContent: {
        padding: 20,
        fontSize: 30,
        color: 'rgba(255,255,255,0.7)',
        borderBottomWidth: 0.7,
   },
   search: {
       borderWidth: 1.5,
       backgroundColor: '#9b59b6',
       height: 60
   }
});