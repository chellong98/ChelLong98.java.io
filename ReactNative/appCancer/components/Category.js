import React , {Component} from 'react'
import {
    Text,
    View,
    StyleSheet,
    ListView,
    StatusBar,
    TouchableOpacity
}from 'react-native';
var URL_API='http://10.0.3.2:8080/Json/JsonServlet'
class Category extends Component {
    constructor(props) {
        super(props);
        var ds = new ListView.DataSource({rowHasChanged: (r1, r2)=>r1!==r2});
        this.state= {
            dataSource : ds
        }
    }
   
    fetchData() {
        fetch(URL_API, {method:"GET", body:null})
        .then((response) => response.json()) //lấy về dữ liệu là 1 dạng Json
        .then((responseData) => {
            this.setState({
                dataSource: this.state.dataSource.cloneWithRows(responseData)
            })
        })
        .done()
    }

    componentDidMount(){
        // this.fetchData();
        alert("hello");
    }

    taoHang(property){
        return(
            <TouchableOpacity style={styles.row}>
                <View style={styles.title}>
                    <Text style={styles.rowTitle}>
                        {property.categoryName}
                    </Text>
                </View>
            </TouchableOpacity>
        )
    }

    render() {
        return (
            <View style={styles.container}>
                <StatusBar
                    // hidden='true'
                />
                <View style={styles.header} /*header*/> 
                    <View style={styles.baoTitle}>
                        <Text style={styles.titleHeader}>
                            Tin tức
                        </Text>
                    </View>
                </View>
                <View style={styles.list}/*danh sach category*/>
                    <ListView
                        dataSource={this.state.dataSource}
                        renderRow={this.taoHang.bind(this)}
                    />
                </View>
            </View>
        );
    }
}

var styles = StyleSheet.create({
    container: {
        flex: 1,
    },
    header: {
        flexDirection: 'row',
        flex: 1,
        backgroundColor: 'rgba(34,139,34,0.7)',
        justifyContent: 'center',
    },
    baoTitle: {
        justifyContent: 'center',
        alignItems: 'center',
        
    },
    titleHeader: {
        fontSize: 20,
        fontWeight: '400',
        color: 'white',
    },
    list: {
        flex: 10,
        backgroundColor:'#6ab04c',
    },
    row: {
        flexDirection: 'row',
        flex: 1,
        padding: 10,
        borderBottomWidth: 1,
        borderColor: 'red',
    },
    rowTitle: {
        flex: 1,
        justifyContent: 'center',
        alignItems: 'center',
    },
    title: {
        fontSize: 20,
        fontWeight: '300',
        color: 'white',
    }
})

module.exports = Category;