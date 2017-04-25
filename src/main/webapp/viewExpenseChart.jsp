<html>
<head>
    <link href="/css/c3.css" rel="stylesheet" type="text/css">
</head>
<body>
<div id="chart"></div>

<script src="http://d3js.org/d3.v3.min.js" charset="utf-8"></script>
<script src="/js/c3.js"></script>
<script>
    var chart = c3.generate({
        data: {
            columns: [
           //['data1', <%= request.getParameter("data1") %>],
           //['data2', <%= request.getParameter("data2") %>]
           ['data1', 30,10,16,40,59,76],
           ['data2', 20,40,76,30,29,86]

            ],
            type: 'bar',
            onclick: function (d, element) { console.log("onclick", d, element); },
            onmouseover: function (d) { console.log("onmouseover", d); },
            onmouseout: function (d) { console.log("onmouseout", d); }
        },
        axis: {
            x: {
                type: 'categorized'
            }
        },
        bar: {
            width: {
                ratio: 0.3,
//            max: 30
            },
        }
    });
</script>
</body>
</html>
