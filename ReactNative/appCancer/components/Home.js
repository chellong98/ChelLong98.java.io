import React, {Component} from 'react';
import {
    Text, 
    View,
    StyleSheet,
    ListView,
    StatusBar,
    TouchableOpacity,
    ImageBackground
} from 'react-native';

var MENU = [
    {name: 'tin tức'},
    {name: 'hỏi đáp'},
    {name: 'nhật ký'},
]

class Home extends Component {
    
    constructor(props) {
        super(props);
        var ds = new ListView.DataSource({rowHasChanged: (r1,r2) => r1!==r2 });
        this.state = {
            dataSource : ds.cloneWithRows(MENU),
            hidden: true,
            trans: true,
            
        }
        this._pushView = this._pushView.bind(this);
        this.taoHang = this.taoHang.bind(this);
    }

    taoHang(property) { //param là giá trị của datasource 
        return (
            <TouchableOpacity style={styles.listRow} onPress={()=>this._pushView(property.name)}>
                <View style={styles.title}>
                    <Text style={styles.rowText}>
                        {property.name}
                    </Text>
                </View>
            </TouchableOpacity>
        );
    }

    _pushView(menuName) {
        if(menuName=="tin tức") {
            this.props.navigation.navigate('Category')
            /**
             * không sử dụng this.props.navigator.push() vì chỉ dành cho IOS
             */
        }
        // if(menuName=="hỏi đáp") {
        //     this.props.navigator.push({ //chuyển trang
        //         name:'components',
        //         component: require('./HoiDap'),
        //         props: { //set thuộc tính
        //             title: menuName,
        //         }
        //     })
        // }
        // if(menuName=="nhật ký") {
        //     this.props.navigator.push({ //chuyển trang
        //         name:'components',
        //         component: require('./NhatKy'),
        //         props: { //set thuộc tính
        //             title: menuName,
        //         }
        //     })
        // }
    }

    render() {
        return (
            <ImageBackground 
            source={require('../images/backgroundHome.jpg')}
            style = {styles.container}>
                <StatusBar 
                 hidden={this.state.hidden}
                // backgroundColor = "blue"
                barStyle = "light-content"
                translucent = {this.state.trans}
                /> 
                <View style = {styles.header}>
                    <Text style = {styles.headerText}>
                     Cancer
                    </Text>
                </View>
                <View style = {styles.list}>
                   <ListView
                    dataSource={this.state.dataSource}
                    renderRow={this.taoHang}
                   />
                </View>
            </ImageBackground>
        );
    }
}

var styles = StyleSheet.create(
    {
        container: {
            flex: 1,
        },
        header: {
            flex: 1,
            justifyContent: 'center',
            alignItems: 'center',
            backgroundColor: 'rgba(34,139,34,0.7)',
            borderBottomWidth: 2,
            borderColor: 'green',
        },
        headerText: {
            color: 'white',
            fontSize: 20,
            fontWeight: '400',
        },
        list: {
            flex: 10, //chiếm 10 phần
            // backgroundColor: 'white',
           
        },
        listRow: {
            flexDirection: 'row',
            flex: 1,
            padding: 10,
            borderBottomWidth: 2,
            borderColor: 'rgba(34,139,34,0.7)',
        },
        title: {
            flex: 1,
            justifyContent: 'center',
            alignItems: 'center',
        },
        rowText: {
            fontSize: 18,
            fontWeight: '300',
            color: 'white'
        }
    }
)

module.exports = Home;

