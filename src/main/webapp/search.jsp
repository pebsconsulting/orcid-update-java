<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
	//VERY simple templating. YMMV.
    final String title = "ORCID Datacentre reporting";
%>
<html>
<head>
    <title><%= title %></title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    
    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="/api/webjars/html5shiv/3.6.2/html5shiv.js"></script>
      <script src="/api/webjars/respond.js/1.3.0/respond.min.js"></script>
    <![endif]-->
    
    <!-- fetch our maven managed css dependencies -->
    <link rel='stylesheet' href='/api/webjars/bootstrap/3.0.3/css/bootstrap.min.css' />
	<!-- 
	<link rel='stylesheet' href='/api/webjars/datatables/1.9.4/media/css/jquery.dataTables.css' />
	 -->
	<link rel='stylesheet' href='/api/webjars/datatables-plugins/ca6ec50/integration/bootstrap/3/dataTables.bootstrap.css' />
</head>
<body>


<div class="container" >
	<div class="navbar navbar-default" role="navigation">
	        <div class="navbar-header">
		        <a class="navbar-brand" href="#"><%= title %><span class='glyphicon glyphicon-tranfer'></span></a>
	          <ul class="nav navbar-nav">
	            <!-- <li><a href="/">Add Work</a></li>  -->
	            <li class="active"><a href="#">Explore Orcid</a></li>
	            <li><a href="javascript:$('#helpModal').modal('show')">Help</a></li>
	          </ul>
	        </div>
	</div>
	
	<div id="orciddiv">
		<table cellpadding="0" cellspacing="0" border="0" class="table table-condensed" id="orcidtable"></table>
	</div>
	
	<!-- Help Modal -->
	<div class="modal fade" id="helpModal" tabindex="-1" role="dialog" aria-labelledby="helpModalLabel" aria-hidden="true">
	  <div class="modal-dialog">
	    <div class="modal-content">
	      <div class="modal-header">
	        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
	        <h4 class="modal-title" id="myModalLabel">Help</h4>
	      </div>
	      <div class="modal-body">
	        <p>This tool enables you to lookup ORCiD users by their work DOIs.</p>
	        <p>Enter a complete DOI (e.g. "10.9998/abc123") or DOI prefix (e.g."10.9998/") in the search box to see the ORCiDs that have one or more registered works with that DOI.</p>
	        <p>You can change the identifier type to search and how to match it using the drop-downs.</p> 
	        <!-- button type="button" data-dismiss="modal" onClick="javascript:">Try Me</button> -->
	      </div>
	      <div class="modal-footer">
	        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
	      </div>
	    </div><!-- /.modal-content -->
	  </div><!-- /.modal-dialog -->
	</div><!-- /.modal -->
	
	
	<div class="footer">
	<hr/>
	  <p>Provided by <a href="http://bl.uk/">The British Library</a> as part of the <a href="http://odin-project.eu/">ODIN project</a>.</p>
	  <p>Source code available on <a href="https://github.com/TomDemeranville/orcid-update-java">GitHub</a>. Questions to <a href="http://twitter.com/tomdemeranville">@tomdemeranville</a>.</p>
	</div>
</div>
<!-- fetch our maven managed javascript dependencies last to speed loading-->
<script src="/api/webjars/jquery/1.9.0/jquery.min.js"></script>
<script src="/api/webjars/bootstrap/3.0.3/js/bootstrap.min.js"></script>
<script src="/api/webjars/datatables/1.9.4/media/js/jquery.dataTables.min.js"></script>
<script src="/api/webjars/datatables-plugins/ca6ec50/integration/bootstrap/3/dataTables.bootstrap.js"></script>
<!-- 
<script src="/api/webjars/datatables-plugins/ca6ec50/pagination/bootstrap.js"></script>
 -->
<script>
	//STARTUP CODE
	var oTable; // our handle on the datatable
	var idType = "doi";
	var matchType = "prefix";
	
	$(function() {
		//$('#orciddiv').html( '<table cellpadding="0" cellspacing="0" border="0" class="display" id="orcidtable"></table>');
		 oTable = $('#orcidtable').dataTable( {
		        "bProcessing": true,
		        "bServerSide": true,
		        "sAjaxSource": "/api/report/datatable",
		        "fnServerParams": function ( aoData ) {
			        //this is called every request!
		            aoData.push( {"name":"searchtype", "value":matchType} );
		            aoData.push( {"name":"idtype","value":idType });
		        },
		        "aoColumns": [
		                      { "mData": "name","sTitle":"name","bSortable": "false" },
		                      //{ "mData": "orcid","sTitle":"orcid","bSortable": "false" },
		                      { "mData": "link","sTitle":"orcid","bSortable": "false" }
		                  ]
		                 
		        
		    } );
		 //style the input elements see http://datatables.net/forums/discussion/comment/52857
		 $('#orcidtable_length label select').addClass('form-control');
		 $('#orcidtable_filter label input').addClass('form-control');
		 $('.dataTables_filter input').attr('placeholder', 'Example: 10.9998 or uk.bl');

		 //create a drop down for id type
		 $('<select></select>')
			.attr("id", "idtype")
	        .append('<option value="doi">DOI</option>')
	        .append('<option value="isbn">ISBN</option>')
	        .append('<option value="other-id">Other ID</option>')
	        .on("change", function(){
		        idType = this.value;
		        oTable.fnClearTable(0);
		        oTable.fnDraw();
	        })
	        .addClass('form-control')
	        .appendTo($('#orcidtable_filter'));

		 //create a drop down for search type
		 $('<select></select>')
			.attr("id", "prefix")
	        .append('<option value="prefix">Prefix Match</option>')
	        .append('<option value="exact">Exact Match</option>')
	        .append('<option value="solr">Solr Syntax</option>')
	        .on("change", function(){
		        matchType = this.value;
		        oTable.fnClearTable(0);
		        oTable.fnDraw();
	        })
	        .addClass('form-control')
	        .appendTo($('#orcidtable_filter'));
	});
	</script>
</body>
</html>