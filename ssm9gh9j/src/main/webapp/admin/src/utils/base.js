const base = {
    get() {
        return {
            url : "http://localhost:8080/ssm9gh9j/",
            name: "ssm9gh9j",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssm9gh9j/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "演唱会购票系统"
        } 
    }
}
export default base
