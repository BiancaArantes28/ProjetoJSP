<!-- footer content -->
<footer>
    <div class="pull-right">
        Sistema Fitness
    </div>
    <div class="clearfix"></div>
</footer>
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
 <script src="https://cdn.datatables.net/1.10.16/js/jquery.dataTables.min.js"></script>
<script>
    $(".excluir-meta").click(function(){
        var meta = $(this).data("meta");
        if(confirm("Você deseja excluir esta meta?")){
            $(".display-"+meta).css({"display" : "none"});
        }
    });
    $(document).ready(function() {
        $('#data-table').dataTable({
            
        });
    });
</script>
<!-- /footer content -->