<!-- footer content -->
<footer>
    <div class="pull-right">
        Gentelella - Bootstrap Admin Template by <a href="https://colorlib.com">Colorlib</a>
    </div>
    <div class="clearfix"></div>
</footer>
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script>
    $(".excluir-meta").click(function(){
        var meta = $(this).data("meta");
        if(confirm("Você deseja excluir esta meta?")){
            $(".display-"+meta).css({"display" : "none"});
        }
    });
</script>
<!-- /footer content -->